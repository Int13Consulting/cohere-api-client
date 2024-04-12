# Getting Cohere-ative 🤖 💬 

This repo is home to a Java API client for the Cohere AI Chat endpoint, released under the MIT license. This library provides a simple and easy-to-use way to interact with the Cohere AI API. 

This library is still a work in progress, and the development team is still working on adding more features and functionality. So, if you have any ideas or improvements to help shape the direction of this project, please do not hesitate to contribute! 

If you're not already using this library in your projects, here's why you should consider it:

- 🚀 Performance: With this library, you can streamline your process and get responses delivered quickly with our optimized data transfer. 

- 📋 Easy to use: No need to spend time learning complex API protocols. Our user-friendly interface makes life easier, allowing you to jump right in.

# Setup Guide 💿

If you are not familiar with how the library can be used, here is a basic example to get you started: 

```java
String cohereAPIKey = "YOUR_API_KEY_HERE";
CohereAIClient aiClient = new CohereAIClient("https://api.cohere.ai", cohereAPIKey , "Test app");
CohereRequest request = new CohereRequest();
request.setModel("command-r");
request.setMaxTokens(1024);
request.setMessage("What is the \"Answer to the Ultimate Question of Life, the Universe, and Everything\"");
CohereResponse response = aiClient.submitChatRequest(request);
System.out.println(gson.toJson(response));
```

In this code, you need to replace `YOUR_API_KEY_HERE` with your actual API key that you get from the Cohere AI dashboard. 

Be sure to declare the Gson library, commonly used for JSON operations, to make the code run smoothly. 

If you are using Maven, add these dependencies to your `pom.xml`:

```xml
<dependency>
    <groupId>org.apache.httpcomponents</groupId>
    <artifactId>httpclient</artifactId>
    <version>4.5.13</version> <!-- Verify this is the latest version -->
</dependency>
<dependency> 
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.13.1</version> <!-- Verify this is the latest version -->
</dependency>
```

If you're using Gradle, add this to your dependencies:

```groovy
implementation 'org.apache.httpcomponents:httpclient:4.5.13'
implementation 'com.google.code.gson:gson:2.13.1'
```

# Issues and Contributions 📋 🤝 

If you do find any issues, please report them here, so the team can take a look and help. 

If you wish to contribute to the development of the library, please follow our contribution guidelines. The core team is always happy to welcome any new contributors to this project, and they provide assistance and guidance throughout the process! 

# License 📋 

This project is under the MIT License. See the [LICENSE](LICENSE) file for the full license text. 

📧 For any questions, comments, or if you just want to say hi, feel free to reach out to us! 

Have a great day and happy coding! 👩‍💻 🤖
