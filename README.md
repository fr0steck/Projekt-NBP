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

