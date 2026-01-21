function flickSwitch(arr){

    if(arr.length == 0){
      return [];
    }

    let result = recursiveFlickSwitch(arr, false);

    return result;
  }

  function recursiveFlickSwitch(arr, isBlockFlick){


    let currentValue = arr.shift();

    let result = [];

    if(!isBlockFlick){

      if(currentValue != 'flick'){

        result.push(true);

        console.log(currentValue, isBlockFlick, result)

      }
      else if(currentValue == 'flick'){

        result.push(false);
        isBlockFlick = true;
        console.log(currentValue, isBlockFlick, result)

      }

    }
    else{

      if(currentValue == 'flick'){

          result.push(true);
          isBlockFlick = false;

          console.log(currentValue, isBlockFlick, result)

      }
      else if(currentValue != 'flick'){

          result.push(false);
          isBlockFlick = true;

          console.log(currentValue, isBlockFlick, result)

      }
    }



    // Base Case
    if (arr.length == 0){

      return result;

    }

    result.push(...recursiveFlickSwitch(arr, isBlockFlick));

    // Recursive Case
    return result;

  }