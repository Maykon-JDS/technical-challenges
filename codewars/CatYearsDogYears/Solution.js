// https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b/train/javascript


var humanYearsCatYearsDogYears = function(humanYears) {

    let human = humanYears >= 1 ? 15 : 1;

    let secondYear = humanYears >= 2 ? human + 9 : human;

    let cat = humanYears > 2 ? ((humanYears - 2) * 4) + secondYear : secondYear;

    let dog = humanYears > 2 ? ((humanYears - 2) * 5) + secondYear : secondYear;

    return [humanYears, cat, dog];
  }
