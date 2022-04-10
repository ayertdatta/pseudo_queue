# SECURE PSEUDO QUEUE

__Website URL:__

https://pseudo-queue-natwest.herokuapp.com/main/postdata

__Process flow of project:__

1. First create 2 spring boot project
2. Make api service which will communicate between them
3. Turn the response body to string & encrypt them with Gson
4. Pass that to the api service of other spring boot project
5. Get the value, decrypt it to object by Gson
6. Add the value in H2 Database
7. If all process goes well success text will be returned

__H2 Database View:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/h2_database.jpeg)

__Postman with success text:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/postman.jpeg)

__Project Tree View:__

![image](https://github.com/ayertdatta/pseudo_queue/blob/master/pics/tree_project.png)
