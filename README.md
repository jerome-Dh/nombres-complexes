# Les nombres complexes


## Manipulation des nombres complexes

![accueil](https://github.com/jerome-Dh/nombres-complexes/blob/master/features/c1.JPG)

Les nombres complexes introduits en classe de Terminale scientifique
constituent un bon moyen d'apprendre les algorithmes en résolvant les
problèmes quotidiens.


## Commencer

Cette petite démonstration sur les nombres complexes permet à toute 
personne de mieux apprendre à programmer en exploitant les 
meilleures techniques d'implémentation.
Il s'agit d'utiliser l'approche objet (POO) avec intégration
des tests unitaires pour vérifier la viabilité des résultats.


### Conditions préalables

Toute personne souhaitant se lancer dans cette aventure doit avoir
des connaissances en mathématiques discrètes (calculs algébriques), l'algorithmique, 
le langage Java (ou toute autre langage intégrant le paradigme orienté objet)
et savoir faire des tests unitaires.

Les logiciels et outils suivants sont nécessaires 
pour écrire et tester son programme
- OS: Windows, Linux, Mac OS
- JDK >= 11
- Apache Maven >= 3
- Git >= 2
- JUnit >= 4

[Note] Après installation, ajoutez les chemins d'exécution dans la
variable d'environnement path de votre système 
pour ``JDK``, ``Maven`` et ``Git``.
Suivez ce guide pour voir comment ajouter un chemin dans le 
path: https://www.java.com/fr/download/help/path.xml 


### Installation

Dans un répertoire de votre disque (par exemple C:\developpements)
clonez le projet
```
 git clone https://github.com/jerome-Dh/nombres-complexes-java.git
```
Après l'installation, vous pouvez modifier le code source à votre guise.

[NB] Les fichiers avec les extensions .bat situés à la racine sont des 
fichiers de commandes, vous pouvez les modifier pour 
compiler, tester et exécuter rapidement votre programme.

## Lancer les tests unitaires

Une meilleure façon d'écrire les algorithmes efficaces avec la POO
est de suivre la technique de développement guidée par les test (TDD en anglais)

Un petit tour sur [Wikipedia](https://fr.wikipedia.org/wiki/Test_driven_development) 
pour apprendre plus sur les TDD

Si vous suivez toujours, lancez les tests
``` 
mvn test
```

Tous les tests dévraient reussir
![test-reussi](https://github.com/jerome-Dh/nombres-complexes/blob/master/features/c2.JPG)


## Ecrivez vos propres algorithmes

* Pour apprendre, remplacez le contenu de chaque méthode de la 
classe ``Complexe`` par des retours vides

Exemple pour la méthode ``sub``

```
public Complexe sub(Complexe c)
{
	return new Complexe();
}
```

* Faites la même opération sur toutes les autres méthodes 
(n'oubliez pas de considérer le type de retour)

* Maintenant lancez les tests unitaires, normalement tout devrait 
échouer preuve que les méthodes de la classe ``Complexe`` 
ne donnent pas des résultats vrais.

* Ecrivez vos propres algorithmes dans ces méthodes 
à fin qu'elles renvoient les bons résultats

* Une fois terminé, lancez les tests. 
Si tout est vert alors bravo, vous avez réussi.

[NB] Ameléorer votre programme en ajoutant des opérations 
à la classe ``Complexe``

Quelques exemples:

- Inverse du nombre complexe
- Racine carrée du nombre complexe
- Et bien d'autre que vous jugerez utile

Ecrivez ensuite des tests pour chaque opération et rassurez-vous
qu'ils reussissent.


## Utiliser la classe Complexe

L'utilisation fait suite aux tests qui prouvent que toutes les
opérations donnent des bons résultats

```
Complexe c1 = new Complexe(2, -3),
		c2 = new Complexe(-1, 2);

//Addition
System.out.println("\n" + c1 + " - " + c2 + " = " + c1.sub(c2));

//Module
System.out.println("\n|" + c2 + "| = " + c2.mod());
```

## Construite avec

- Notepad++
- JDK
- Apache Maven
- Git
- JUnit


## Contribuants


### Auteurs

*** Travail initial : Jerome Dh
- [GitHub](https://github.com/jerome-Dh)
- [LinkedIn](https://www.linkedin.com/in/jerome-dh)

### Contributeurs

- [Jerome Dh](https://github.com/jerome-Dh)


## Licence

Ce projet est sous licence MIT - voir le fichier [MIT license](https://opensource.org/licenses/MIT).

## Remerciements

* A toute personne dont le code a été utilisé
* A tous les contributeurs
