# Compil_MACA

Ajouter les librairies à la racine pour que ça marche:
-> Clique droit sur JRE System Library
-> Build Path
-> Configure Build Path
-> Add JAR -> "antlr-3.3-complete.jar"
-> ok

....................................................................

TDS: --> Regarder 

Dès que l'on rencontre "var_decl", la tds doit stocker l'identifiant et le type, etal portée:
    var n : int; --> cette instruction doit automatiquement stocker ('n';'var';'int')

...................................................................

Contrôles sémantiques:

Bien spécifier que la ligne lors du contrôle est bien stockée !!

Vérifier qu'une variable/classe est déclarée avant chaque instruction la concernant. De même chaque expression ne concerne que les éléments déjà déclarés.

Vérifier à chaque déclaration de classe que sa classe est définie.

Une classe ne peut être redéfinie par un mm programme.

La portée des classes et méthodes est 0 (visible partout).

Dans une classe, un identificateur est soit un argument (ou attribut), soit une méthode. Il ne peut y avoir un argument (ou attribut) et méthode de même nom dans une classe.

Règles de portée des arguments et variables locales comme dans Java.

La portée d'une variable locale commence à la fin de sa déclaration et et termine à la fin du bloc englobant cette même déclaration.

Les contrôles de typages doivent tenir compte de l'héritage.

Lien pour la TDS : http://henri-garreta.developpez.com/tutoriels/techniques-outils-compilation/?page=page_4

...............................................................
