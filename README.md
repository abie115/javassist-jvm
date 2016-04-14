# javassist

Aplikacja RESTful przy pomocy Jersey oraz Jetty.

Uruchomienie
```
mvn clean install exec:exec
```
Strona: http://localhost:5555/rest/sleep/10 <br>
Ostani parametr możemy zmieniać, oznacza on czas  uśpienia wątku (Thread.sleep()) w milisekundach. Na stronie pojawia się odpowiedź: Uspiono na: {czas}. Agent przekazuje czas wykonywania metody do logów (czas pojawia się w konsoli).
