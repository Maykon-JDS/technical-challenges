/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {

    let columns = [[], [], [], [], [], [], [], [], []];
    let boxs = [[], [], [], [], [], [], [], [], []];

    for(let i = 0; i < board.length; i++){

        let line = board[i];

        if(i < 3){

           boxs[0].push(line.slice(0,3));
           boxs[1].push(line.slice(3,6));
           boxs[2].push(line.slice(6,9));

        }
        else if(i >= 3 && i < 6){

           boxs[3].push(line.slice(0,3));
           boxs[4].push(line.slice(3,6));
           boxs[5].push(line.slice(6,9));

        }
        else if(i >= 6 && i <= 8){

           boxs[6].push(line.slice(0,3));
           boxs[7].push(line.slice(3,6));
           boxs[8].push(line.slice(6,9));

        }

        for(let j = 0; j < line.length; j++){

            let column = line[j];

            if(column == "."){

                continue;

            }

            let occurrencesColumn = columns[j].filter((columnsValue) => {

                return columnsValue == column;

            }).length

            if(occurrencesColumn > 0){

                return false;

            }

            columns[j].push(column);

            let occurrencesLine = line.filter((lineValue) => {

                return lineValue == column;

            }).length

            if(occurrencesLine > 1) {

                return false;

            }

        }

    }

    for(let i = 0; i < boxs.length; i++){

        let box = boxs[i];

        let boxFlated = box.flat();

        for(let j = 0; j < boxFlated.length; j++){

            let value = boxFlated[j];

            let occurrencesValue = boxFlated.filter((boxValue) => {

                return (boxValue == value && boxValue != ".") ;

            }).length

            if(occurrencesValue > 1) {

                return false;

            }


        }

    }

    return true;

};