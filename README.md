# OpenCode

OpenCode is a LeetCode clone designed to be completely open source. Users can create submissions for questions which can be reviewed by admins. All questions in OpenCode will be free.

# Tools

OpenCode uses Spring Boot, PostgreSQL, and will eventually migrate to React for the front end

It is highly recommended to use IntelliJ for your IDE, as IntelliJ is the IDE used in development

# Installation

Once the OpenCode repository cloned and PostgreSQL is installed, users will need to create a "question" table and connect to the database using the following commands:

**psql**

**CREATE DATABASE question;**

**GRANT ALL PRIVILEGES ON DATABASE "question" TO <yourUsername>;**

**\c question**

Now the server can be started in IntelliJ by running the OpenCodeApplication configuration. Open index.html in your browser and a list of sample questions should appear.
This sample data can be modified in

**src/main/com/t7s/opencode/question/QuestionConfig.java**
