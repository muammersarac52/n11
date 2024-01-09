Feature:Uye_olma

  @uyeOl
  Scenario: Uye_olma

  Scenario Outline:
    Given MS Kullanici url gider
    When  MS Ana sayfayi dogrular
    And MS Uye ol butonuna tiklar
    And MS Acilan sayfayi dogrular
    And MS Aramaya "<ad>" ad yazarAnd
    And MS Aramaya "<soyAd>" soyAd yazar
    And MS Aramaya "<eMail>" eMail yazar
    And MS Aramaya "<tel>" tel yazar
    And MS Aramaya "<sifre>" sifre yazar
    And "<cinsiyet>"cinsiyet secer
    And Tiklamalari yapar
    And numarani dogrula tusuna basar

    Examples:
      | ad      | soyAd | eMail                  | tel         | sifre      | cinsiyet |
      | Muammer | sarac | imir.maxin@falkcia.com | 05448523685 | fgt56tyyhS | erkek    |
      | selin   | savas | sarac_m@hotmail.com    | 05448253685 | fgt5kiyyhS | kadin    |

