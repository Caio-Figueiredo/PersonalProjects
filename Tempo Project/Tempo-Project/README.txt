/----/

How I approched the problem:

Well, first of all, I realized how to consume the given endpoints, and work with the objects provided by the GET requests. So I designed a class diagram to map the entities, and created the database model to structure all the logic, and work with these entities that I've designed. So I created the classes previously defined in the diagram (User entity, Role entity) to deal with the json objects provided by the endpoints.

Then I designed some Services, Resources and Repositories for classes previously created to deal with all the operations needed to create Roles, and assign this Roles to different users.

Then I realized that would be necessary a Service to make requests in the endpoints and return objects that I could work with. So I created a resource to access the endpoints called AccessAPIResource. This service will build a variable path , appending the path inputed with a String provided (this String must be one userId that the endpoint provides) in the body of a Post request in the /users path, and return a User object thats is going to be registered in our database through the createUsers operation in the resource UsersResource.

With this user in our database, we can proceed with the operation to assign it a Role through the assignUserRole method.

/----/

Suggestion for improvements in the future:

Basicilly, I focused in the main challenge that was create the service with the ability to create/delete roles and assign it to different users. But, in the future would be interesting improve the application to deal with exceptions through a additional package just to treat exceptions.

Improve user services to return users per role, and users per Team;

Create a Team Service, and Team Resources & repositories, to work with Roles within teams entity, and give the service the ability to assign role to a intire Team, or different roles to the same team through the members assigned to this team. And finally, improve this service to return teams per role, and roles per team like a filter.



/----/

How to run the code:

The code is in a Docker Compose container, with the Spring boot application and a Postgres database to store the data we will work with.

Run the docker containers available in the docker repository (https://hub.docker.com/r/souzacaio/souzacaio_repository/tags) with docker-compose named, and we will be able to use the application. There are 3 pre-registered Roles named: Tester, Product Owner and Developer.

/----/
Instructions to Register a new Role:

To register a new Role we need to input a json object in the body of a POST request in the endpoint localhost:8080/roles.
raw-json object example:
{
   "roleName": "TheNameYouWant"
}
Submit this object in a JSON-raw format.

/----/
Instructions to Register a new User

And to register a new user within the database we need just to submit a JSON String with the userID provided in the Tempo Endpoints, and then the application will get this user from the endpoint and transform it in a database entity to work with.
Example:
raw-json String:
fd282131-d8aa-4819-b0c8-d9e0bfb1b75c

/----/
Instructions to assign a new Role to an user

To assign a Role to an user we need to make a PUT request in the endpoint localhost:8080/users/{userID} informing in the body of the request the roleId number of the role we want to assign to.
raw-json RoleId:
3
This example will assign the role 3 to the user.


