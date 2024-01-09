#Task2

Uml:
,-------------------------.
|Employee                 |
|-------------------------|
|+Employee(String, String)|
|-------------------------|
|+name(): String          |
|+department(): String    |
|+toString(): String      |
|                         |
`-------------------------'
           / \
          /   \ <extends>
  ,--------.   ,-------.
  |Engineer|   |Manager|
  |--------|   |-------|
  `--------'   `-------'

  Fråga 2:
  Nej det är inte möjligt då man bara kan ärva från en klass.
  Man får använda composition istället.

  Fråga 4:
  Du måste har en equals-metod i Role.




