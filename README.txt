objectif de l'application : 
- représenter les liens entre individus et pouvoir les analyser
- faire des requêtes du style : 
	- quels sont les amis de mr X
	- qui sont ses enfants
	- qui sont ses ancêtres
	
les relations à traiter : 
	- amis
	- enfants
	- parents
	
l'application doit permettre : 
- de définir des personnes 
- de créer des relations entre des personnes
- d'afficher les relations (avec une interface graphique ou ligne de commande) 

évidemment tu dois utiliser TOUS les concepts que tu connais, POO, interfaces, héritage et toussa

commence par le cas le plus simple: essaie de définir une relation père fils entre mr dupont et james

Person c'est Vertex, et relation c'est Edge


enum DAYS {
    JAN,FEB,MAR
  }
  @Test
  void testEnum() {
    DAYS myday = DAYS.FEB;
    Assertions.assertEquals(DAYS.FEB,myday);
  }


t'aurais pu faire un truc style : 
Relations relations = new Relations();
relations.addParentChild(john,pierre)
assertEquals(Relation.PARENT,relations.getRelation(john,pierre))



genre 3 colonnes : nom prénom de la personne 1 / type de lien / nom prénom de la personne 2

ex  si john à deux enfants patrick et pierre 
John | PARENT | patrick
John | PARENT | pierre
patrick | ENFANT | john
pierre | ENFANT | john

si t'es motivée, tu peux faire en version arbre généalogique  mais c'est plus compliqué :p

quand t'as fini d'afficher les relations, tu fais un formulaire pour ajouter des nouvelles relations/personnes

pis l'étape d'après c'est de faire des algo de parcours de graphe pour déterminer des trucs marrants style le nombre 
d'amis en commun entre deux personnes, le nombre de descendants, le nombre  d'ancêtres etc... et afficher les infos quand tu sélectionneras une cellule de ton tableau


je veux un truc du style : 
- Relations relations = new Relations (// tu entres les 4 relations via une liste ou en dur dans le constructeur)
- relations.getChildsOf(A) // doit retourner B, C D
- relations.getChildsOf(C) // doit retourner B



