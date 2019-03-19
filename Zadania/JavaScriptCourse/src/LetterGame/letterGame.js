var watchword = "come to papa";
watchword = watchword.toUpperCase();

var length = watchword.length;

var watchword1 = "";

for (i=0; i<length; i++) {
    if (watchword.charAt(i) == " ") {
        watchword1 += " ";
    } else {
        watchword1 += "-";
    }
}

function writeWatchword() {
    document.getElementById("board").innerHTML = watchword1;
}

window.onload = writeWatchword;