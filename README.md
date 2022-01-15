# Usages of Factory Method for Data Source Layer (Local/Remote - Repository) with DI & MVVM [Android]


Stacks:
* MVVVM
* DI (Hilt)
* Factory Method (Design Pattern)

# When & Why?

## Factory Method
Is a creational design pattern that is concerned with the creation of objects in an application. As the name suggests, the factory method pattern makes use of classes that acts as factories to create objects. This pattern favors method invocation instead of making direct constructor calls to create objects. 

In the factory method pattern, you provide an interface, which can be a Java interface or an abstract class to create objects. A factory method in the interface defers the object creation to one or more concrete subclasses at run time. The subclasses implement the factory method to select the class whose objects need to be created.

## When?
In our Android Project, we have **local**, or **remote data source**  (or both). For clean code & testibility purpose we keep our business logic sperate from the Feature layer. From the Feature layer, we call respective repository (or data source) to execute the business logic and notify about the result. 

In such case, in terms of Enterprise or Large Scale application, we might have lots of  Repository object across the application and client should not manually instantiate the objects by its own. So, the object creation process for the **Repository Objects** manage by a **Factory**, where it's responsibility to create the concrete objects for the client, based on the requested object type.


In this example project, we are creating the **RepositoryFactory** object in the under **SingletonComponent** [**SingletonModule**], and providing the request objects to the dependent under **ViewModelComponent** [**RepositoryModule**], where **RepositoryModule** use the **RepositoryFactory** object's instance provided by **SingletonModule** to initialize the requested object to the dependent. 