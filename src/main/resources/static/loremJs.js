function selectAllLorem() {
        var x = document.createRange();

        x.setStartBefore(document.getElementById("loremFrame"));
        x.setEndAfter(document.getElementById("loremFrame"));
        window.getSelection().addRange(x);
}

function copyAllLorem() {
    var x = document.createRange();

    x.setStartBefore(document.getElementById("loremFrame"));
    x.setEndAfter(document.getElementById("loremFrame"));
    window.getSelection().addRange(x);
    document.execCommand('copy');
    window.getSelection().removeAllRanges();
}

function showHiddenText() {

    document.getElementById("hidden").classList.remove("text-copied-hidden");


}