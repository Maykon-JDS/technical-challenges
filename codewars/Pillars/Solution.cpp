long pillars(short num_of_pillars, short distance, short width) {

  if (num_of_pillars <= 1){
    return 0;
  }

  int widthTips = width;

  return (((distance * 100) + width) * (num_of_pillars - 1)) - widthTips;
}