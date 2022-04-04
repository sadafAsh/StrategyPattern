# StrategyPattern
        
         Strategy Pattern defines a family of algorithm s,encapsulate each  one and make them 
interchangeable.It lets the algorithm vary independently from the clients that uses it.
        
         In these project,"Animal" class is a super class and "Dog" and "Bird" are the sub classes 
that extends "Animal" class."Animal" class has an instance variable in the field having flyingType
of type Fly."Fly" is the interface ."ItFly" and "CannotFly" are the concrete classes which implements 
the "Fly" interface."ItFly" and "CannotFly" is the algorithms.Now "Animal" or "Dog" or Bird can 
dynamically switch between "ItFly" and "CannotFly".  

USE OF STRATEGY PATTERN:
     It avoids the duplicate code.
    
     Can hide the complicated code from the user.


JunitTest:
  
   There is JUnit Test also present for all "Strategy Pattern"  and test coverage are 100%
  successful by jacoco reports.
 
  
         
    SONARQUBE :
            In sonarqube,reliability ,security , securityReview and maintainability is A and 
  the code coverage is 100%. 

       
  SONARQUBE 
  
  gradle command to publish code to sonarqube

gradlew sonarqube 
  -Dsonar.projectKey=StrategyPattern 
  -Dsonar.host.url=http://localhost:9000 
  -Dsonar.login=bc0968c1990ee0b3480b7983d48b8cfe6f8d6051
