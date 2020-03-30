//CKEDITOR.replace('editor');

document.getElementById("bewerk-button").onclick = function(){

	document.getElementById("normal-content").style.display = "none";
	document.getElementById("bewerk-button").style.display = "none";
	document.getElementById("form-editor").style.display = "initial";
	CKEDITOR.replace('editor');
}