# AI-BASED-RECOMMENDATION-SYSTEM

COMPANY: CODTECHIT SOLUTIONS

NAME: YASHVI BHALA

INTERNID: YASHVI38684

DOMAIN: JAVA 

DURATION: 6 WEEKS

MENTOR: NEELA SANTOSH

##REPORT ON AI BASED RECOMMENDATION SYSTEM

🎯 Objective of the Task
The objective of Task 4 was to build an AI-powered recommendation system using Java, with support from external machine learning libraries — specifically Apache Mahout. The aim was to suggest relevant items (like movies, products, or content) to users based on their previous preferences. This task introduced me to collaborative filtering, user behavior analysis, and recommendation logic, all crucial aspects of real-world intelligent systems like Netflix, Amazon, or Spotify.

🧠 Key Concepts Implemented
Concept	Explanation
Collaborative Filtering	The system recommends items to users based on the behavior of similar users.
Data Modeling	Uses a CSV file (ratings.csv) that contains user-item-rating relationships.
Apache Mahout Integration	Utilizes Mahout’s built-in algorithms for similarity measurement and recommendation.
User Similarity Algorithm	Pearson Correlation Similarity for determining similar users.
Recommender Engine	A Mahout GenericUserBasedRecommender to generate real-time suggestions.

📊 How It Works
Data Input: A sample CSV file (ratings.csv) contains entries in the format:

Copy
Edit
userID,itemID,rating
Example:
1,101,5.0 → User 1 rated item 101 with 5 stars.

User Input: The program prompts the user to enter a User ID.

Recommendation Logic:

Apache Mahout calculates user similarity using Pearson Correlation.

It then finds the nearest neighbors (similar users).

Based on those users' item ratings, the system recommends new items to the current user.

Output: The top 2-3 recommended item IDs with predicted rating scores are displayed.

🛠 Technologies and Tools Used
Java SE 8

Apache Mahout Core 0.9

IDE: IntelliJ IDEA / Eclipse (or command-line Java compiler)

Input File: ratings.csv – sample dataset for training

Mahout Classes Used:

FileDataModel

PearsonCorrelationSimilarity

NearestNUserNeighborhood

GenericUserBasedRecommender

📘 Learning Outcomes
Through this task, I gained practical insights into:

How recommendation engines work

Integrating external ML libraries in Java

Data preprocessing and user behavior modeling

Collaborative filtering and similarity metrics

How scalable AI models can be developed using open-source tools

✅ Task Outcome
The application worked successfully by:

Accepting user IDs interactively

Parsing a real dataset

Generating meaningful recommendations using Mahout

Displaying results in a clean and structured format

The code was structured, commented, and can be easily expanded with real-world datasets or UI interfaces.

📁 Deliverables Submitted
InteractiveRecommender.java: Java code file using Apache Mahout for AI-based suggestions

ratings.csv: Sample training data

Instructions to run, including Maven setup or JAR dependencies

📌 Conclusion
Task 4 was a solid introduction to machine learning in Java, especially in the context of recommendation systems. It bridged the gap between core Java and modern AI/ML applications. The use of Apache Mahout made it scalable and modular. This task completed the internship with a hands-on AI project that simulates real industry use-cases. The project is ready for enhancement through deeper ML algorithms, UI layers, or deployment.

OUTPUT: 

<img width="743" height="178" alt="Image" src="https://github.com/user-attachments/assets/11925d7c-05f3-40f4-ac3f-c3120a9890b7" />
