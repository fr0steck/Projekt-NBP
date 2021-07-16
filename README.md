# Projekt-NBP
Nazwa zadania: Aplikacja przeliczająca kursy walut 
Cel zadania: Sprawdzenie umiejętności wykorzystania Spring Framework oraz Spring Boot podczas tworzenia aplikacji serwerowej.
Miejsce umieszczenia kodu: Repozytorium GitHub.

Opis zadania:

Funkcjonalność podstawowa (wymagana):

Korzystając z dostępnych funkcjonalności Spring Framework oraz Spring Boot należy przygotwać aplikację udostępniającą metody do przeliczenia podanych przez użytkownika walut wg aktualnych kursów. Usługi mają zostać udostępnione przy pomocy REST’a. Do uzyskania aktualnych kursów walut należy wykorzystać udostępnione API przez Narodowy Bank Polski pod adresem  http://api.nbp.pl.

Aplikacja powinna udostępniać następujące funkcjonalności :
• listę dostępnych walut na których można wykonać przeliczenia (min 5)
• przeliczenie na podstawie kursu wymiany dla następujących parametrów: kwota, z jakiej waluty, do jakiej waluty
• udostępnienie aktualnych kursów dla listy walut

Dodatkowo w dowolnej bazie danych należy przechowywać wszystkie wywołania wykonywane na udostępnionych usługach i serwisie zewnętrznym z kursami walut. Baza danych powinna być zarządzana dowolnym systemem kontroli struktury (database migration-tool). 
Do opisanej funkcjonalności nie jest potrzebne GUI wystarczy dostarczyć przykładowe zapytania do wywołania przy pomocy curl'a lub dokumentację opisującą jak nazwane są usługi oraz jakie parametry należy przekazać. Ewentualnie można wbudować do aplikacji narzędzie Swagger lub inne pozwalające na zbudowanie dokumentacji do udostępnionego API. 
Proszę również o przygotowanie pliku docker compose, który po wywołaniu komendy docker compose up uruchomi kontener z działającą aplikacją i kontener bazodanowy.
 
 
Funkcjonalność zaawansowana (niewymagana):
 
Korzystając z dostępnych narzędzi typu load-balancer i docker compose przygotować plik compose z kilkoma serwisami zawierających funkcjonalność wymaganą. Następnie zasymulować opóźnienia w odpowiedzi z tych serwerów tak, aby można było wykonać zapytania przez LB do pozostałych wolnych serwisów.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Project-NBP
The name of the task: Application that converts currency exchange rates Aim of the task: Checking the ability to use Spring Framework and Spring Boot while creating the server application. Where to put the code: GitHub repository.

Task description:

Basic functionality (required):

Using the available functionalities of Spring Framework and Spring Boot, you should prepare an application that provides methods for converting the currencies specified by the user according to the current exchange rates. The services are to be made available via REST. To obtain current exchange rates, use the API provided by the National Bank of Poland at http://api.nbp.pl.

The application should provide the following functionalities: • a list of available currencies on which conversions can be made (min 5) • conversion based on the exchange rate for the following parameters: amount from which currency to which currency • providing current exchange rates for the list of currencies

In addition, any database should store all calls made on external services and website with exchange rates. The database should be managed with any structure control system (database migration-tool). The described functionality does not require a GUI, it is enough to provide sample queries to be called with curl or documentation describing how services are named and what parameters should be passed. Alternatively, you can embed the Swagger tool into the application or another tool that allows you to build documentation for the shared API. Please also prepare the docker compose file, which, after calling the docker compose up command, will launch the container with the running application and the database container.

Advanced functionality (not required):

Using the available load-balancer and docker compose tools, prepare a compose file with several services containing the required functionality. Then simulate the delay in response from these servers so that LB queries can be made to other free services.

