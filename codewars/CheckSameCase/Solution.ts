export function sameCase(a : string, b : string): number {

    if(!isLetter(a) || !isLetter(b)){

      return -1;

    }

    if (a == a.toUpperCase() && b == b.toUpperCase()) {
      return 1;
    }
    else if (a == a.toLowerCase() && b == b.toLowerCase()){
      return 1;
    }

    return 0;
  }

  function isLetter(value: string): boolean {
    return /^[a-zA-Z]$/.test(value);
  }
