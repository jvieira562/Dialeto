const yourname = "José_Vieira";
const ainame = "Katinha";

var input = document.getElementById("chatinput");
var chatroom = document.getElementById("chatroom");

var aiMessages = [];
aiMessages.push("Olá!");
aiMessages.push("alguém para me ajudar no conteúdo de gramatica?");
aiMessages.push("Na primeira etapa");
aiMessages.push("Eu posso te ajudar! já passei neste nível.");

setTimeout(nextAiMessage, 300);

input.addEventListener('keypress', function(e) {
  if (e.keyCode == 13) {
    if (input.value.length > 0) {
      createChatMessage(yourname, input.value);
      setTimeout(nextAiMessage, 1000);
      input.value = "";
    }
  }
});

function nextAiMessage() {
  if(aiMessages.length > 0) {
  	createChatMessage(ainame, aiMessages.shift());
  } else {
  	createChatMessage(ainame, "is no longer logged in.");
  }
}

function createChatMessage(username, message) {
  var ele = document.createElement("p");
  ele.innerHTML = username + ": " + message;
  if (chatroom.children.length >= 4) {
    chatroom.removeChild(chatroom.childNodes[0]);
  }
  chatroom.appendChild(ele);
}