# OpenCode

OpenCode is a LeetCode clone designed to be completely open source. Users can create submissions for questions which can be reviewed by admins. All questions in OpenCode will be free.

This project is the Spring Boot back-end, the front-end can be found here: https://github.com/StrangeQuark/OpenCode-frontend

# Tools

The OpenCode back-end uses Spring Boot and PostgreSQL

It is highly recommended to use IntelliJ for your IDE, as IntelliJ is the IDE used in development

# Installation

Once the OpenCode repository cloned and PostgreSQL is installed, users will need to create an "opencode" table and connect to the database using the following commands:

**psql**

**CREATE DATABASE opencode;**

**GRANT ALL PRIVILEGES ON DATABASE "opencode" TO \<YourUsername\>;**

**\c opencode**

Now the server can be started in IntelliJ by running the OpenCodeApplication configuration. Download and open the OpenCode front-end to view the website in action
