Feature: DB

@deneme
  Scenario Outline:

    * Database baglantisi kurulur.
    * Staff tablosundaki "Id" leri listeler.
    * verilen "<Id>" dogrulanir.
    * Database baglantisi kapatilir.


    Examples:
    |Id|
    |3|
