// return binary representation as integer
int convert_to_int(float input) {

  union {

    float f;
    int i;

  } u;

  u.f = input;
  return u.i;
}