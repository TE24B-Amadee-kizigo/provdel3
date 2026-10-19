// talen [i] = slump.nextInt(19);
// int minst = talen [0]
// for 
//{
// if (minst>talen [i])
//{minst= talen [i]}
//}




void main ()
{
int [] talen = new int [6];
Random slump = new Random();
for (int i =0; i<talen.length; i++)
{
talen [i] = slump.nextInt(9);
}

for (int i =0; i<talen.length; i++)
if (talen [i]>i)
{
    IO.println(talen [i]+ " är ditt tal");
}
else{
    IO.println(talen [i]+ " är ditt tal");
}
int minst = talen [0];
for (int i =0; i<talen.length; i++)
      if (minst>talen [i])
{
    minst = talen [i];
}
IO.println(minst + " är det minsta siffran");

//meny 

int val = 0;

while(val !=3)
{
    IO.println("\nMeny:");
    IO.println("1. Addera 2 tal");
    IO.println("2. Multiplicera 2 tal");
    IO.println("3. Avsluta");
    IO.print("välj :");

    val = Integer.parseInt(IO.readln());

    if (val == 1)
    {
        IO.print("Skriv tal 1:");
        int tal1 = Integer.parseInt(IO.readln());

         IO.print("Skriv tal 2:");
        int tal2 = Integer.parseInt(IO.readln());

        int summa = tal1 + tal2;
        IO.println("summan är "+ summa);
    }
  if (val == 2)
    {
        IO.print("Skriv tal 1:");
        int tal1 = Integer.parseInt(IO.readln());

         IO.print("Skriv tal 2:");
        int tal2 = Integer.parseInt(IO.readln());

        int produkten = tal1 * tal2;
        IO.println("produkten är "+ produkten);
    }
if (val == 3)
{
    IO.println("programmet avslutas");
}

}


}

