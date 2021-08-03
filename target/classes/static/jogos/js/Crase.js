var myQuestions = [
	{
		question: "1. Aqueles materiais são para ____ .  ",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
	
		},
		correctAnswer: 'a'
	},
	{
		question: "2. Tenho de ler bastante para ____ escrever melhor.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
		
		},
		correctAnswer: 'b'
	},
	{
		question: "3. Para___, não há nenhum problema.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "4. O chefe trouxe este lápis para ___ experimentar.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "5. Silvia, faça isso para ___.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "6. Para___,isso não tem importância.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "7. Necessito de sua ajuda para ___ terminar o trabalho.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "8. Preciso de mais informações para ___ completar o relatório.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "9. Estão todos contra ___.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "10. Para___ ir ao médico , precisarei sair mais cedo.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "11. Curvou-se ante ____, com humildade.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "12. Compre um presente para ___ dar.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "13. Compre um presente para ___.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'a'
	},
    {
		question: "14. Traga a correspondência para ___assinar. ",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    {
		question: "15. Preciso de dinheiro para ___ fazer as compras.",
		answers: {
			a: 'Mim<br>',
			b: 'Eu<br>',
			
		},
		correctAnswer: 'b'
	},
    
];

var quizContainer = document.getElementById('quiz');
var resultsContainer = document.getElementById('results');
var submitButton = document.getElementById('submit');

generateQuiz(myQuestions, quizContainer, resultsContainer, submitButton);

function generateQuiz(questions, quizContainer, resultsContainer, submitButton){

	function showQuestions(questions, quizContainer){
		
		var output = [];
		var answers; 

		for(var i=0; i<questions.length; i++){
			
			
			answers = [];

			
			for(letter in questions[i].answers){

			
				answers.push(
					'<label>'
						+ '<input type="radio" name="question'+i+'" value="'+letter+'">'
					
						+ questions[i].answers[letter]
					+ '</label>'
				);
			}

			
			output.push(
				'<div class="question">' + questions[i].question + '</div>'
				+ '<div class="answers">' + answers.join('') + '</div>'
			);
		}

	
		quizContainer.innerHTML = output.join('');
	}


	function showResults(questions, quizContainer, resultsContainer){
			
		
		var answerContainers = quizContainer.querySelectorAll('.answers');
		
		
		var userAnswer = '';
		var numCorrect = 0;
		
		
		for(var i=0; i<questions.length; i++){

			
			userAnswer = (answerContainers[i].querySelector('input[name=question'+i+']:checked')||{}).value;
			
			
			
			if(userAnswer===questions[i].correctAnswer){
				
				numCorrect++;
				
				
				answerContainers[i].style.color = 'lightgreen';
			}
			
			else{
				
				answerContainers[i].style.color = 'red';
			}
		}

			
			resultsContainer.innerHTML = numCorrect + ' de ' + questions.length;
		}

	
	showQuestions(questions, quizContainer);


	submitButton.onclick = function(){
		showResults(questions, quizContainer, resultsContainer);
    }
}
