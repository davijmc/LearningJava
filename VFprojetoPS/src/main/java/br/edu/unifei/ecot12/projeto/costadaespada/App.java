package br.edu.unifei.ecot12.projeto.costadaespada;

public class App {
	public static void main(String[] args){
		Morder morder = new Morder();
		Atingir atingir = new Atingir();
		Lobo lobo = new Lobo();		
		Aventureiro aventureiro = new Aventureiro();
		Guerreiro guerreiro = new Guerreiro();
		Escudo escudo = new Escudo();
		Armadura armadura = new Armadura();
		Espada espada = new Espada();
		AnelDosTresDesejos a1 = new AnelDosTresDesejos();
		Mago mago = new Mago();
		Encantamento encantamento = new Encantamento();
		Feitico feitico = new Feitico();
		Bardo bardo = new Bardo();
		InstrumentoMusical instrumento = new InstrumentoMusical();
		Taverneiro taverneiro = new Taverneiro();
		Taverna taverna = new Taverna();
		Soldado soldado = new Soldado();
		Governante governante = new Governante();
		Cidade cidade = new Cidade();
		
		cidade.setNome("NeverWinter");//testando cidade
		cidade.setPopulacao(10000);
		System.out.print("Nome da cidade: ");
		System.out.println(cidade.getNome());
		System.out.print("Habitantes: ");
		System.out.println(cidade.getPopulacao());
				
		System.out.println("\n-Atributos Aventureiro-");//testando lobo e aventureiro
		System.out.print("Forca: ");
		System.out.println(aventureiro.getForca());
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		aventureiro.setMotivacao("Fama");
		System.out.print("Motivacao: ");
		System.out.println(aventureiro.getMotivacao());
		aventureiro.setClasse("Guerreiro");
		System.out.print("Classe: ");
		System.out.println(aventureiro.getClasse());
		System.out.println("\n-Atributos Lobo-");
		System.out.print("Forca: ");
		System.out.println(lobo.getForca());
		System.out.print("Vitalidade: ");
		System.out.println(lobo.getVitalidade());
		lobo.setRaiva(11);
		System.out.print("Raiva: ");
		System.out.println(lobo.getRaiva());
		
		armadura.setVitalidade(50);//testando equipamentos
		escudo.setVitalidade(10);
		espada.setForca(100);
		guerreiro.setAventureiro(aventureiro);
		guerreiro.setEspada(espada);
		guerreiro.setEscudo(escudo);
		guerreiro.setArmadura(armadura);
		guerreiro.equipar();
		System.out.println("\n-Atributos aventureiro apos equipar-");
		System.out.print("Forca: ");
		System.out.println(aventureiro.getForca());
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		
		morder.setLobo(lobo);//testando combate
		morder.setAventureiro(aventureiro);
		atingir.setAventureiro(aventureiro);
		atingir.setLobo(lobo);
		morder.atacar();
		atingir.atacar();
		System.out.println("\nPos combate:");
		System.out.print("Vitalidade lobo: ");
		System.out.println(lobo.getVitalidade());
		System.out.print("Vitalidade Aventureiro: ");
		System.out.println(aventureiro.getVitalidade());
		
		/*System.out.println("\nAtributos mago:");//testando mago
		feitico.setForca(53);
		aventureiro.setClasse("Mago");
		mago.setAventureiro(aventureiro);
		mago.setMago(mago);
		mago.setFeitico(feitico);
		mago.conjurar();
		System.out.print("Forca: ");
		System.out.println(aventureiro.getForca());
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		System.out.print("Classe: ");
		System.out.println(aventureiro.getClasse());*/

		System.out.print("\n*Durabilidade Anel: ");//testando o objeto unico do governante
		System.out.println(a1.getDurabilidade());
		a1.desejar(a1.getDurabilidade());
		System.out.print("*Durabilidade Anel, 1 desejo feito: ");
		System.out.println(a1.getDurabilidade());
		
		instrumento.setNome("Bandolin");//testando outras classes
		a1.desejar(a1.getDurabilidade());
		escudo.setVitalidade(100);
		armadura.setVitalidade(150);
		mago.setPoder("Feitico");
		encantamento.setForca(50);
		feitico.setForca(55);
		bardo.setInstrumento("Bandolin");
		
		taverneiro.setAmbicao(1000);//testando o taverneiro e a taverna
		System.out.print("\nAmbicao do taverneiro: ");
		System.out.println(taverneiro.getAmbicao());
		if(taverneiro.isServindo()) {
			System.out.println("Taverneiro esta servindo");
		}else {
			System.out.println("Taverneiro nao esta servindo");
		}
		taverna.setArea(100);
		System.out.print("Area da taverna: ");
		System.out.println(taverna.getArea());
		System.out.print("Imposto da taverna: ");
		System.out.println(taverna.getImposto()+" gc");
		
		governante.setNome("Lorde Nasher Alagondar");//testando governante
		governante.setDinheiro(10005);
		System.out.print("\nGovernante: ");
		System.out.println(governante.getNome());
		System.out.print("Dinheiro do governante: ");
		System.out.println(governante.getDinheiro()+" gc");
		
		soldado.setObediencia(150);//testando soldado
		System.out.print("Obediencia do soldado: ");
		System.out.println(soldado.getObediencia());
		soldado.setTaverna(taverna);
		soldado.setGovernante(governante);
		soldado.cobrarImposto();
		System.out.print("Dinheiro do governante depois do soldado cobrar impostos: ");
		System.out.println(governante.getDinheiro()+" gc");
		soldado.setObediencia(50);//testando soldado
		System.out.print("Obediencia do soldado: ");
		System.out.println(soldado.getObediencia());
		soldado.cobrarImposto();
		System.out.print("Dinheiro do governante depois do soldado cobrar impostos: ");
		System.out.println(governante.getDinheiro()+" gc");
		
		aventureiro.setTaverneiro(taverneiro);
		aventureiro.setAventureiro(aventureiro);
		aventureiro.beber();//testando bebida
		System.out.println("\n-Vitalidade aventureiro apos beber 1 bebida-");
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		aventureiro.beber();//testando bebida
		System.out.println("\n-Vitalidade aventureiro apos beber 2 bebidas-");
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		aventureiro.beber();//testando bebida
		System.out.println("\n-Vitalidade aventureiro apos beber 3 bebidas-");
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		for (int x = 0; x < 63849; x++) {//testando bebida muitas vezes
			aventureiro.beber();
		}
		System.out.println("\n-Vitalidade aventureiro apos beber muitas bebidas-");
		System.out.print("Vitalidade: ");
		System.out.println(aventureiro.getVitalidade());
		aventureiro.setClasse("Divindade");//brinquei que vira divindade
		System.out.print("Classe: ");
		System.out.println(aventureiro.getClasse());
	}
}
