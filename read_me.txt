1 =============================Description=======================
Le but du pattern Abstract Factory est la creation d'objets regroupes en famille
sans devoir connaitre les classes concretes destinees a la creation de ces objets.

2 =============================Context===========================
Le systeme de vente de vehicules gere des vehicules fonctionnant a essence et en electricite.
Cette gestion est confiee a l'objet catalogue qui cree de tels objets.
Pour chaque produit, nous disposons d'une classe abstraite, d'une sous-classe concrete decrivant la version du produit
fonctionnant a l'essence et d'une sous-classe decrivant la version du produit fonctionnant en electricite.