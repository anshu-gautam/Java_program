void deleteAtPos()
{
  int a[100] = {3, 5, 6, 8, 7};
  int num, pos, size = 5, i;
  printf("enter pos");
  scanf("%d", &pos);
  if (pos < 0)
  {
    printf("invalid pos");
  }
  else
  {
    for (i = pos - 1; i < size - 1; i++)
      ;
    a[i] = a[i + 1];
  }
}
