#Set up mongodb database
1) Download mongodb from https://www.mongodb.com/download-center/community
2) MongoDB requires a folder to store all data so we will create a directory with these commands :
C:\> mkdir data
C:\> cd data
C:\> mkdir db
3) Verify configuration by runing the command mongo 
C:\> mongo
4) Setting up Environment Variables :
Advanced System Settings -> Environment Variables -> Path(Under System Variables) -> Edit -> C:\Program Files\MongoDB\Server\4.0\bin
5) start the MongoDB serve :
C:\> mongod 

#View BackEndController
1) Run MaiiaTestApplication
2) Open up http://localhost:8080/

#start angular ui
1) Start console
2) Type npm update
3) Type ng serve
2) Open up http://localhost:4200/

#generate the backend jar and the frontend war
1)cd MaiiaTest
2)mvn clean package

#Note : 
You have to run the rest the post endpoint http://localhost:8080/recuperate_posts_from_url to fill the database with the data extracted before running the ihm



