function neutralise(s1, s2) {
    return s1
      .split('')
      .map((char, index) => (char === s2[index] ? char : '0'))
      .join('');
  }
