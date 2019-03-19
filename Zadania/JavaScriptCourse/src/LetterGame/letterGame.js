var watchword = "come to papa";
watchword = watchword.toUpperCase();

var length = watchword.length;
var missCount = 0;

var yes = new Audio("yes.wav");
var no = new Audio("no.wav");

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

window.onload = lettersGenerate;

var letters = ["A", "Ą", "B", "C", "Ć", "D", "E", "Ę", "F", "G", "H", "I", "J", "K", "L", "Ł", "M", "N", "Ń", "O", "Ó", "P", "Q", "R", "S", "Ś", "T", "U", "V", "W", "X", "Y", "Z", "Ż", "Ź"];



function lettersGenerate() {

    var divContent = "";

    for (i = 0; i < 35; i++){

        var element = "letter" + i;
        divContent = divContent + '<div class="letter" onclick="check('+i+')" id="'+ element +'">' + letters[i] +'</div>';

        if ((i+1) % 7 == 0) {
            divContent = divContent + '<div style="clear:both;"></div>';
        }
    }

    document.getElementById("alphabet").innerHTML = divContent;

    writeWatchword();
}

String.prototype.setChar = function (place, char) {
    if (place > this.length - 1) {
        return this.toString();
    } else {
        return this.substr(0, place) + char + this.substr(place + 1)
    }
}

function check(nr) {

    var hit = false;

    for (i=0; i<length; i++) {
        if (watchword.charAt(i) == letters[nr]) {
            watchword1 = watchword1.setChar(i, letters[nr]);
            hit = true;
        }
    }

    if (hit == true) {

        yes.play();
        var element = "letter" + nr;
        document.getElementById(element).style.background = "#003300";
        document.getElementById(element).style.color = "#00C000";
        document.getElementById(element).style.border = "3px solid #00C000";
        document.getElementById(element).style.cursor = "default";

        writeWatchword();
    } else {

        no.play();
        var element = "letter" + nr;
        document.getElementById(element).style.background = "#330000";
        document.getElementById(element).style.color = "#C00000";
        document.getElementById(element).style.border = "3px solid #C00000";
        document.getElementById(element).style.cursor = "default";
        document.getElementById(element).setAttribute("onclick", ";");

        //miss
        missCount++;
        var image = "img/s" + missCount + ".png";
        document.getElementById("tree").innerHTML = '<img id="im0" src="' + image + '" alt="" />'
    }

    //win
    if (watchword == watchword1) {
        document.getElementById("alphabet").innerHTML = "Yes! You give right watchword: " + watchword + "<br /><br /><span class='reset' onclick='location.reload()'>ONCE AGAIN?</span>";
    }

    //lose
    if (missCount >= 9) {
        document.getElementById("alphabet").innerHTML = "OH NO! You're not give right watchword :( <br /><br /><span class='reset' onclick='location.reload()'>ONCE AGAIN?</span>";
    }

    writeWatchword();
}