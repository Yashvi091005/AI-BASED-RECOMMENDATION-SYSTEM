import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.DataModelBuilder;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;

import java.io.*;
import java.util.*;

public class InteractiveRecommender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "ratings.csv"; // Make sure this file exists in the same directory

        try {
            DataModel model = new FileDataModel(new File(filePath));
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);
            GenericUserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            while (true) {
                System.out.print("\n👤 Enter user ID (or type 'exit'): ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    System.out.println("👋 Exiting Recommendation System. Bye BOSS!");
                    break;
                }

                try {
                    long userId = Long.parseLong(input);
                    List<RecommendedItem> recommendations = recommender.recommend(userId, 3);

                    System.out.println("🔮 Recommended Items for User " + userId + ":");
                    if (recommendations.isEmpty()) {
                        System.out.println("🙁 No recommendations found (user may need more ratings).");
                    } else {
                        for (RecommendedItem item : recommendations) {
                            System.out.println("👉 Item ID: " + item.getItemID() + " | Score: " + item.getValue());
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Invalid user ID format. Please enter a number.");
                } catch (TasteException e) {
                    System.out.println("🚫 Error generating recommendations: " + e.getMessage());
                }
            }

        } catch (IOException | TasteException e) {
            System.out.println("❌ Failed to load data model: " + e.getMessage());
        }

        scanner.close();
    }
}
