# SECURE PSEUDO QUEUE

__Website URL:__

https://pseudo-queue-natwest.herokuapp.com/main/postdata

__Process flow of project:__

1. Send the array of request data to the above URL as a POST call
2. Turn the response body to string & encrypt them with Gson
3. Pass that to the api service of other spring boot project
4. Get the value, decrypt it to object by Gson
5. Add the value in H2 Database
6. If all process goes well success text will be returned

__Step to create the project:__

1. Create 2 spring boot project
2. Api services to communicate between them
3. AES encryption util function for both the project
4. Models for all request & response model
5. Design the project according to the process flow mentioned above

__H2 Database View:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/h2_database.jpeg)

__Postman with success text:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/postman.jpeg)

__Project Tree View:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/tree_project.png)
