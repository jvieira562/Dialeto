package app.web.dialeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author José Victor Santos V
 *
 */
@RestController
@Controller
public class DialetoController {

	ModelAndView modelAndView = new ModelAndView();

	@RequestMapping("/")
	public ModelAndView index() {
		System.out.println("\n\nDialetoController - Controller\n\n");
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/login")
	public ModelAndView login() {
		modelAndView.setViewName("login");
		return modelAndView;
	}

	@RequestMapping("/escolha")
	public ModelAndView escCadastro() {
		System.out.println("escolha cadastro - DialetoController");
		modelAndView.setViewName("escCadastro");
		return modelAndView;
	}

	@RequestMapping("/registroAluno")
	public ModelAndView registroAluno() {
		modelAndView.setViewName("registroAluno");
		return modelAndView;
	}

	@RequestMapping("/registroProf")
	public ModelAndView registroProf() {
		modelAndView.setViewName("registroProf");
		return modelAndView;
	}

	@RequestMapping("/homeProfessor")
	public ModelAndView areaProf() {
		modelAndView.setViewName("homeProfessor");
		return modelAndView;
	}

	@RequestMapping("/editarPerfilAluno")
	public ModelAndView editarPerfilAluno() {
		modelAndView.setViewName("editarPerfilAluno");
		return modelAndView;
	}

	@RequestMapping("/editarPerfilProfessor")
	public ModelAndView editarPerfilProfessor() {
		modelAndView.setViewName("editarPerfilProfessor");
		return modelAndView;
	}

	@RequestMapping("/recuperarSenha")
	public ModelAndView recuperarSenha() {
		modelAndView.setViewName("recuperarSenha");
		return modelAndView;
	}

	@RequestMapping("/trocarSenha")
	public ModelAndView trocarSenha() {
		modelAndView.setViewName("trocarSenha");
		return modelAndView;
	}

	/* ATUALIZAR HTML e CSS */
	@RequestMapping("/alunoConteudoLista")
	public ModelAndView alunoConteudo() {
		modelAndView.setViewName("alunoConteudoLista");
		return modelAndView;
	}

	/* ATUALIZAR HTML e CSS */
	@RequestMapping("/telaConteudo")
	public ModelAndView telaAlunoConteudo() {
		modelAndView.setViewName("telaAlunoConteudo");
		return modelAndView;
	}

	@RequestMapping("/notaAlunos")
	public ModelAndView notaAlunosProfessor() {
		modelAndView.setViewName("notaAlunos");
		return modelAndView;
	}

	@RequestMapping("/conteudoAluno")
	public ModelAndView conteudoAluno(@RequestParam String categoria) {
		if (categoria.equalsIgnoreCase("Verbo")) {
			modelAndView.addObject("titulo","Verbo");
			modelAndView.addObject("conteudo", "Descrição do verbo. ");
		}
		
		else if (categoria.equalsIgnoreCase("pronomes2")) {
			modelAndView.addObject("titulo", "Pronomes: para mim, ou para eu?");
			modelAndView.addObject("conteudo", "- A expressão “para mim” será empregada quando “mim” exercer a função\n"
					+ "								de objeto direto.\n"
					+ "								- A expressão “para eu” deve ser usada quando “eu” assumir a função de\n"
					+ "								sujeito.\n"
					+ "								“Para mim”:\n"
					+ "								Você pode comprar o ingresso para mim? (fim de frase)\n"
					+ "								Aquele convite é para mim, não para você. (antes de vírgula)\n"
					+ "								Entre mim e você há uma grande amizade. (com preposição)\n"
					+ "								Dica: “Mim”, é um pronome pessoal oblíquo tônico e deve vir antes de uma\n"
					+ "								preposição (palavra invariável que serve para ligar termos ou orações.\n"
					+ "								Exemplos: a, ante, após, até, com, contra, de, desde, em, entre, para,\n"
					+ "								perante, por (per), sem, sob e sobre).\n"
					+ "								“Para eu”:\n"
					+ "								Preciso de férias para eu descansar.\n"
					+ "								Faltam quinze dias para eu correr a maratona.\n"
					+ "								Dica: “Para eu” deve ser utilizado sempre que o sujeito for seguido de um\n"
					+ "								verbo no infinitivo (ar, er, ir, ôr) que indique uma ação.");
		}
		
		else if (categoria.equalsIgnoreCase("reformaOrtográfica")) {
			modelAndView.addObject("titulo", "Reforma Ortográfica\n");
			modelAndView.addObject("conteudo", "Reforma Ortográfica - Em vigor desde 2009, a reforma ortográfica pretende\n"
					+ " fazer com que pouco mais de 210 milhões de pessoas em oito países, que falam o português, tenham a \n"
					+ "escrita unificada, conservando as variadas pronúncias.\n"
					+ "\n"
					+ " A vigência obrigatória do novo Acordo Ortográfico da Língua Portuguesa passou a valer desde o dia 1º\n"
					+ " de janeiro de 2016.\n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("conceitos")) {
			modelAndView.addObject("titulo", "Conceitos\n");
			modelAndView.addObject("conteudo", "Sinônimos - significados idênticos ou muito parecidos.\n"
					+ "Antônimos - significado contrário, oposto ou inverso ao de outra palavra.\n"
					+ "Significados/Conceitos - definição, concepção ou caracterização. É a formulação de uma ideia por\n"
					+ " meio de palavras ou recursos visuais.\n"
					+ "Variáveis - palavras que não vão para o plural, nem para o feminino. São variáveis os artigos,\n"
					+ " adjetivos, numerais, pronomes, substantivos e verbos. Já invariáveis são os advérbios, as \n"
					+ "conjunções, as interjeições e as preposições.\n"
					+ "Usos - a Gramática de Uso privilegia o uso real da língua. Ou seja, enquanto as gramáticas tradicionais\n"
					+ " lidam com muita teoria e definições de termos técnicos, uma gramática de uso dá mais atenção ao modo \n"
					+ "como os falantes nativos da língua realmente usam a língua no dia a dia e de modo gramaticalmente correto.\n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("classesGramaticais")) {
			modelAndView.addObject("titulo", "Classes Gramaticais\n");
			modelAndView.addObject("conteudo", "Substantivos: nessa classe ficam apenas as palavras que dão nome às coisas. Por exemplo: caderno, mesa, lápis, etc."
				+	"Adjetivos: são as palavras que dão uma característica, qualidade ou um defeito ao substantivo. Por exemplo: bonita, gordo, alto, pequeno, quente, etc."
				+	"Numerais: São palavras que expressam uma ideia de quantidade. Por exemplo: dois, primeira, triplo, meio, etc."
				+	"Artigos: essa classe é formada por palavras que ficam antes dos substantivos, e determinam a eles um gênero e uma\n"
				+   " quantidade plural ou singular. São eles: o, a, os, as, um, uma, uns, umas."
				+	"Verbos: é a classe das palavras que indicam uma ação, estado, fenômeno ou fato, e podem variar em conjugações\n"
				+   " de acordo com o tempo, número, pessoa, modo e voz. Exemplo: ficar, fazer, estar, ser, comer, fugir, chover, queimar, etc."
				+	"Pronomes: são palavras que substituem o nome ou a que ele se refere. Exemplo: eu, ela, aquele, minha, etc."
				+	"Preposições: essa classe possui palavras que ligam duas outras palavras ou termos. Exemplo: até, após, portanto, etc."
				+	"Advérbios: são palavras que podem indicar circunstâncias diversas, como tempo, lugar, modo, dúvida, negação, entre outros.\n"
				+   " Exemplo: hoje, aqui, muito, não, etc."
				+	"Conjunções:  E, mas, ou, logo, pois, que, como, porque"
				+	"Interjeições: palavras que exprimem emoções. Exemplos: ah!, oba! oh!, cuidado! Atenção!"

					);
		}
		
		else if (categoria.equalsIgnoreCase("grafia")) {
			modelAndView.addObject("titulo", "");
			modelAndView.addObject("conteudo", ""

					);
		}
		
		else if (categoria.equalsIgnoreCase("pronomes")) {
			modelAndView.addObject("titulo", "Pronomes");
			modelAndView.addObject("conteudo", "- A expressão “para mim” será empregada quando “mim” exercer a função de objeto direto. \n"
					+ "- A expressão “para eu” deve ser usada quando “eu” assumir a função de sujeito. \n"
					+ "\n"
					+ "“Para mim”:\n"
					+ "Você pode comprar o ingresso para mim? (fim de frase)\n"
					+ "Aquele convite é para mim, não para você. (antes de vírgula)  Entre mim e você há uma grande amizade. (com preposição)\n"
					+ "Dica: “Mim”, é um pronome pessoal oblíquo tônico e deve vir antes de uma preposição (palavra invariável que serve para ligar\n"
					+ " termos ou orações. Exemplos: a, ante, após, até, com, contra, de, desde, em, entre, para, perante, por (per), sem, sob e sobre).\n"
					+ "\n"
					+ "“Para eu”:\n"
					+ "Preciso de férias para eu descansar. Faltam quinze dias para eu correr a maratona. Dica: “Para eu” deve ser utilizado sempre que o\n"
					+ " sujeito for seguido de um verbo no infinitivo (ar, er, ir, ôr) que indique uma ação.\n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("uso-dos-porquês")) {
			modelAndView.addObject("titulo", "Uso dos porquês\n"
					+ "\n");
			modelAndView.addObject("conteudo", "Por que – separado e sem acento: \n"
					+ "usado no início da frase para fazer  uma pergunta, forma interrogativa: Por que [razão] houve o rompimento do contrato?\n"
					+ "No meio da frase, mesmo em perguntas diretas: José explicou por que não compareceu à aula hoje?\n"
					+ "Pergunta indireta: Não sabemos por que Matheus não compareceu à aula hoje.\n"
					+ "Em substituição à expressão “pelo qual” e suas variações: Os bairros por que (pelos quais) passamos estavam bastante movimentados. \n"
					+ " | A razão por que (pela qual) aceitei o convite não lhe interessa. \n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("mau-ou-mal")) {
			modelAndView.addObject("titulo", "Uso dos porquês\n"
					+ "\n");
			modelAndView.addObject("conteudo", "Por que – separado e sem acento: \n"
					+ "usado no início da frase para fazer  uma pergunta, forma interrogativa: Por que [razão] houve o rompimento do contrato?\n"
					+ "No meio da frase, mesmo em perguntas diretas: José explicou por que não compareceu à aula hoje?\n"
					+ "Pergunta indireta: Não sabemos por que Matheus não compareceu à aula hoje.\n"
					+ "Em substituição à expressão “pelo qual” e suas variações: Os bairros por que (pelos quais) passamos estavam bastante movimentados. \n"
					+ " | A razão por que (pela qual) aceitei o convite não lhe interessa. \n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("pleonasmo")) {
			modelAndView.addObject("titulo", "Pleonasmo\n"
					+ "\n");
			modelAndView.addObject("conteudo", "Substantivo masculino – trata-se de uma figura de linguagem usada para intensificar o significado de um termo através\n"
					+ " da repetição (desnecessária) da própria palavra ou da ideia contida nela. Alguns exemplos: \n"
					+ "\n"
					+ "		- Entrar para dentro; sair para fora; subir para cima; descer para baixo; adiar para depois; surpresa inesperada; outra alternativa; ver com os olhos; \n"
					+ " protagonista principal; elo de ligação; encarar de frente; conclusão final; há muito tempo atrás; planejar antecipadamente; repetir de novo; consenso \n"
					+ " geral; fatos reais; panorama geral; certeza absoluta; acabamento final; últimos acabamentos; regra geral; outra alternativa; pequenos detalhes; \n"
					+ " monopólio exclusivo; protagonista principal; fato verídico; propriedade característica; escolha opcional; verdade verdadeira; sentidos pêsames; \n"
					+ " sorriso nos lábios; novidade inédita; dupla de dois; duas metades iguais; habitat natural; si mesmo; agora já; junto com; todos foram unânimes; \n"
					+ "	Outros exemplos de pleonasmos: \n"
					+ "		- Minha opinião pessoal; repetir de novo; seguir em frente; comparecer pessoalmente; gritar alto; anexar junto; viver a vida; voltar atrás; arder \n"
					+ " em chamas; ganhar grátis; dar de graça; manter o mesmo; introduzir dentro; retornar de novo; inaugurar novo; preparar de antemão; decapitar a cabeça; \n"
					+ " pisar com os pés; sonhar um sonho; conviver junto; continuar ainda; prevenir antes; hemorragia de sangue; hepatite do fígado; infarto do coração; \n"
					+ " maluco da cabeça; demente mental; labaredas de fogo; cego dos olhos; surdo do ouvido; abertura inaugural; pessoa humana; viúva do falecido; limite \n"
					+ " extremo; empréstimo temporário; sintomas indicativos; nova criação; um mês de mensalidade; planos para o futuro; própria autobiografia; a seu critério \n"
					+ " pessoal; de sua livre escolha; amanhecer o dia;  canja de galinha; estrelas do céu.\n"
					);
		}
		
		else if (categoria.equalsIgnoreCase("verbo-haver")) {
			modelAndView.addObject("titulo", "Verbo Haver \n"
					+ "\n");
			modelAndView.addObject("conteudo", "Esse verbo, no sentido de “ocorrer” ou “existir”, é impessoal, portanto permanece na terceira pessoa do singular, pois não tem\n"
					+ " sujeito. É incorreta a flexão do verbo no plural, talvez a origem do erro seja a associação da conjugação do verbo “haver” com os verbos “existir” e\n"
					+ " “ocorrer”. Estes têm sujeito e, portanto, flexionam-se de acordo com o número e a pessoa.\n"
					+ "Ocorrerão mudanças. | Existirão mudanças.\n"
					+ "Com o verbo “haver”, a regra é diferente – permanece no singular:\n"
					+ "Haverá mudanças.\n"
					+ "O verbo “haver” é usado no plural quando desempenhar a função de verbo auxiliar (que indica pessoa, tempo e modo verbal; sinônimo de “ter” nos tempos\n"
					+ " compostos). Exemplos.:\n"
					+ "Eles haviam chegado cedo. | Eles tinham chegado cedo.\n"
					+ "Como verbo pessoal (com sujeito), pode assumir o sentido de “obter”, “considerar”, “lidar”, ainda que esses usos sejam menos recorrentes:\n"
					+ "Houveram (= “obter”)  do juiz a comutação da pena (sujeito: “comutação da pena”).\n"
					+ "Nós o havemos (= “considerar”) por honesto. (sujeito: “nós”)\n"
					+ "Os alunos houveram-se (= “lidar”) muito bem nos exames. (sujeito: “os alunos”)\n"
					+ "O verbo “haver”, portanto, precisa ser usado com atenção (especialmente, quando ele é impessoal), para evitar erros gramaticais.\n"
					+ ""
					);
		}
			
		else if (categoria.equalsIgnoreCase("esta-está-estar")) {
			modelAndView.addObject("titulo", "Esta\n"
					+ " \n"
					+ "\n");
			modelAndView.addObject("conteudo", "Esta é um pronome demonstrativo feminino singular, usado quando o que está a ser demonstrado está perto da pessoa\n"
					+ " que fala ou no tempo presente em relação à pessoa que fala. Usa-se ainda para referir o que vai ser mencionado no discurso: esta vida; esta\n"
					+ " menina; esta ideia; esta novidade.\n"
					+ "\n"
					+ "Está é a forma conjugada do verbo estar na 3.ª pessoa do singular do presente do indicativo (ele está) ou na 2.ª pessoa do singular do imperativo\n"
					+ " (está tu). Forma verbal no presente do indicativo, é usada principalmente para indicar uma ação que ocorre no exato momento em que se narra a ação. \n"
					+ "Verbo estar – Presente do indicativo: (Eu) estou; (Tu) estás; (Ele) está; (Nós) estamos; (Vós) estais; (Eles) estão\n"
					);
		}
		
		
		else {
			modelAndView.addObject("titulo", ". . .");
			modelAndView.addObject("conteudo", "");
		}
		modelAndView.setViewName("conteudoAluno");
		return modelAndView;
	}

	@RequestMapping("/conteudoAlunoLista")
	public ModelAndView conteudoAlunoLista() {
		modelAndView.setViewName("conteudoAlunoLista");
		return modelAndView;
	}
	@RequestMapping("/jogos")
	public ModelAndView jogos() {
		modelAndView.setViewName("jogos");
		return modelAndView;	
	}
	@RequestMapping("/redacaoFinal")
	public ModelAndView redacaoFinal() {
		modelAndView.setViewName("redacaoFinal");
		return modelAndView;	
	}
}
