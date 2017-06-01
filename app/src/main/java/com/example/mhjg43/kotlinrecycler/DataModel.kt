package com.example.mhjg43.kotlinrecycler
/*
                    .-=====-.
                    | .""". |
                    | |   | |
                    | |   | |
                    | '---' |
                    |       |
                    |       |
 .-================-'       '-================-.
j|  _                                          |
g|.'o\                                    __   |
s| '-.'.                                .'o.`  |
 '-==='.'.=========-.       .-========.'.-'===-'
        '.`'._    .===,     |     _.-' /
          '._ '-./  ,//\   _| _.-'  _.'
             '-.| ,//   \-'  `   .-'
                `// _`--;    ;.-'
                  `\._ ;|    |
                     \`-'  . |
                     |_.-'-._|
                     \  _'_  /
                     |; -:- |
                     || -.- \
                     |;     .\
                     / `'\'`\-;
                    ;    '. `_/
                    |,`-._;  .`|
                    `;\  `.-'-;
                     | \   \  |
                     |  `\  \ |
                     |   )  | |
                     |  /  /` /
                     | |  /|  |
                     | | / | /
                     | / |/ /|
                     | \ / / |
                     |  /o | |
                     |  |_/  |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     |       |
                     '-=====-'
                  God Bless No Bug
*/
class DataModel (name: String, version: String, id_: Int, image: Int){

    var name: String
        internal set
    var version: String
        internal set
    var id: Int
        internal set
    var image: Int
        internal set

    init{
        this.name = name
        this.version = version
        this.id = id_
        this.image = image
    }

}