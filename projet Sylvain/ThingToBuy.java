public class ThingToBuy {

	//PRIVATE ATTRIBUTES
	private String _name;										//nom de l'objectif
	private double _price;  									//prix de l'objectif
	private double _currentAmount;								//somme déjà mise dans l'objectif

	//CONSTRUCTOR
	public ThingToBuy(String name, double price) {
		this._name = name;
		this._price = price;
	}

	//PUBLIC METHODS
	public void display() {								//affiche l'objectif
		//à voir selon l'environnement dans lequel on fera le programme principal
	}

	public void addMoney(double amount) {					//ajoute de l'argent à la "cagnotte"
		this._currentAmount += amount;
	}

	public double getPercentage() {						//renvoie le pourcentage de l'objectif déjà complété
		return (this._currentAmount*100/this._price);
	}

	///GETTERS / SETTERS
		//name
	public void setName(String name) { this._name = name; }
	public String getName() { return this._name; }
		//price
	public void setPrice(double price) { this._price = price; }
	public double getPrice() { return this._price; }
		//currentAmount
	public void setCurrentPrice(double price) { this._currentAmount = price; }
	public double getCurrentPrice() { return this._currentAmount; }
}

/*
attributes :
	String _name : nom de l'objectif
	double _price : prix de l'objectif
	double _currentAmount : somme déjà mise dans l'objectif

methods :
	constructor(String name, double price) : crée un nouvel objectif
	public void display() : affiche l'objectif
	public void addMoney(int amount) : ajoute de l'argent à la "cagnotte"
	public double getPercentage() : renvoie le pourcentage de l'objectif déjà complété
	publig void setName(String name) 
	public String getName()
	publig void setPrice(double price)
	public double getPrice()
	public void setCurrentPrice(double price)
	public double getCurrentPrice()

*/