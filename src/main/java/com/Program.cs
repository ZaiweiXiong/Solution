using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NUnit.Framework;
using System.Collections;
using System.Xml.Serialization;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;




namespace ConsoleApplication2
{
   public class Program 
    {

       
        static void Main(string[] args)
        {
             //int[] array = { 0,3,0,1,9,9};
             //int t = binSearch(array, 9);
            String testString = "abccbb";
            if (plain(testString))
            {
                Console.WriteLine(" it is palinDrome");
            }
            else {

                Console.WriteLine("it is not palinDrome");
            }
             //Console.WriteLine("this is t " + t);
             Console.ReadLine();
        }

        public static bool plain(String myString)
        {
            char[] a = myString.ToArray();
            int i,j;

            for (i = 0, j = a.Length - 1; i <= j; i++, j--)
            {
                if (a[i]!=a[j]){

                    return false;
                }
            }


                  return true;
        }


        public static bool palinDrome(String myString) {

            String first = myString.Substring(0, myString.Length / 2);
            char [] a = myString.ToArray();

            Array.Reverse(a);

            String temp = new String( a);
            String second = temp.Substring(0, temp.Length / 2);

            

            return  first.Equals(second);
        
        }

       public static int binSearch (int [] array, int key) {

           int max = array.Length - 1;
           int lower = 0;
           while (lower <= max) {

               int mid = (max + lower) / 2;

               if (array[mid]<key){
                   lower = mid + 1;
               }
               else if (array[mid] > key)
               {
                   max = mid - 1;

               }
               else {
                   return mid;
               }
           
           }

           return -1;
       }

        public static int BinarySearch(int[] arr, int low, int high, int key)
        {
            int mid = (low + high) / 2;
            if (low > high)
                return -1;
            else
            {
                if (arr[mid] == key)
                    return mid;
                else if (arr[mid] > key)
                    return BinarySearch(arr, low, mid - 1, key);
                else
                    return BinarySearch(arr, mid + 1, high, key);
            }
        }
　　
      public static void quicksort(int[] input, int left,int right){

          int i = left;
          int j = right;
          int pivot = input[(right+left)/2];

          while (i<=j){

              while (input[i]>pivot) {

                  i++;

              }

              while (input[j]<pivot) {
                  j--;
              
              }

              if (i<=j) {

                  int temp = input[i];
                  input[i] = input[j];
                  input[j] = temp;
                  i++;
                  j--;
              
              }
          
          
          }

          if (left<j) {

              quicksort(input,left,j);
          }
          if (i<right) {
              quicksort(input, i, right);
          }






          //Console.WriteLine("after this quicksort!");
      }


        public static void quickSort(int[] input, int left,int right) {
            // as right of pivot must be greater than pivot;
            // as left of pivot must be samll then pivot;
            int pivot = input[(left + right) / 2];
           
            int temp;
            int i = left, j = right;
            while (i<=j) {

                  while (input[i]>pivot){
                      i++;
                  
                  }
                  while (input[j] < pivot)
                  {
                      j--; 
                  
                  }

                  if (i<=j){

                      temp = input[i];
                      input[i] = input[j];
                      input[j] = temp;

                      i++;
                      j--;

                  }
            }

            if(left<j){
                quickSort(input, left, j);
            }
            if(i<right){
                quickSort(input, i, right);
            }
        
        }

        public static void Quicksort(IComparable[] elements, int left, int right)
        {
            int i = left, j = right;
            IComparable pivot = elements[(left + right) / 2];

            while (i <= j)
            {
                while (elements[i].CompareTo(pivot) < 0)
                {
                    i++;
                }

                while (elements[j].CompareTo(pivot) > 0)
                {
                    j--;
                }

                if (i <= j)
                {
                    // Swap
                    IComparable tmp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = tmp;

                    i++;
                    j--;
                }
            }

            // Recursive calls
            if (left < j)
            {
                Quicksort(elements, left, j);
            }

            if (i < right)
            {
                Quicksort(elements, i, right);
            }
        }
        public static void selectSort() {

            int[] input = { 5, 1, 0, 2, 7, 8, 10 };
            int min;
            int temp;
            for (int i = 0; i < input.Length-1;i++ )
            {
                min = i;

                for (int j = i + 1; j < input.Length;j++ )
                {
                    if (input[min]>input[j]){
                        min = j;
                    }

                }

                if (min!=i) {
                    temp = input[i];
                    input[i] = input[min];
                    input[min] = temp;
                }

            }

            for (int i = 0; i < input.Length; i++)
            {
                Console.WriteLine(input[i]);
            }
            
        }
        public static void insertSort() {

            int[] input = { 5,1,0,9,7,8,10};
            int temp;
            for (int i = 0; i < input.Length;i++ )
            {
                for (int j = i; j > 0;j-- )
                {

                    if (input[j]>input[j-1]) {

                        temp = input[j];
                        input[j] = input[j - 1];
                        input[j - 1] = temp;
                    }
                }

                
              
            }

            for (int i = 0; i < input.Length;i++ )
            {
                Console.WriteLine(input[i]);
            }
        
        
        }

        public static void WriteXML(List<Car> cars)
        {
            
            XmlSerializer serializer = new XmlSerializer(cars.GetType(), new XmlRootAttribute("cars"));
            StreamWriter writer = new StreamWriter(@"D:\\kankan\\t.xml");
            serializer.Serialize(writer.BaseStream, cars);
            writer.Close();
            
          
     
            /*
            System.Xml.Serialization.XmlSerializer writer =
                new System.Xml.Serialization.XmlSerializer(typeof(Car));

            var path = "D:\\kankan\\data.xml";
                
            System.IO.FileStream file = System.IO.File.Create(path);
            writer.Serialize(file, car);
            file.Close();
            */
          
            
        }

        public static void readxml()
        {

            System.Xml.Linq.XDocument xdoc = System.Xml.Linq.XDocument.Load("test\\Cars.xml");
            xdoc.Descendants("Car").Select(p => new
            {
                Make = p.Element("Make").Value,
                Model = p.Element("Model").Value,
                year = p.Element("year").Value

            }).ToList().ForEach(p =>
            {

                Console.WriteLine("" + p.Make);
                Console.WriteLine("" + p.Model);
                Console.WriteLine("" + p.year);
                Console.WriteLine("=======================");

            });


                    Console.ReadLine();
       }


        public static void testIndex() {

            String email = "xioza01ca.com@.";

            if (email.IndexOf("@.") != -1)
            {
                Console.WriteLine("it is invaild mail address!");
                Console.ReadLine();
            }
            if (email.IndexOf(".@") != -1 || email.LastIndexOf("@.")!=-1)
            {
                Console.WriteLine("the mail address caannot .@ or @.");
                Console.ReadLine();
            }
            else {

                Console.WriteLine("it is vaild mail address!");
                Console.ReadLine();
            }
        }
        
        public void test_() {


            List<Car> cars = new List<Car>()
            {
                new Car() { Make = "BMD", Model = "5501", year = "1978" },
                new Car() { Make = "BEN", Model = "5501", year = "2001" },
                new Car() { Make = "Dan", Model = "5002", year = "2003" }
            };

            var bmds = from car in cars
                       //where car.Make == "BMD"
                       select car.Model;

            foreach (var car in bmds)
            {
                //Console.WriteLine("{0}-{1}-{2}",car.Make, car.Model, car.year);
                Console.WriteLine("{0}", car);
            }

            DateTime myvalue = DateTime.Now;
            Console.WriteLine(myvalue);
            Console.WriteLine(myvalue.DayOfYear.ToString());
            Console.ReadLine();
        
        }

        static int Recursive(int value, ref int count)
        {
            count++;
            if (value >= 10)
            {
                // throw new Exception("End");
                return value;
            }
            return Recursive(value + 1, ref count);
        }
        public static void test()
        {

            Console.WriteLine("test!" + "https://www.tutorialspoint.com/csharp/csharp_interfaces.htm");
            int b = 0; ;
            for (int i = 0; i < 100; i++)
            {
                b += i;

            }
            Console.WriteLine("a->" + b);
            Console.ReadLine();
        }

      public  class Car {

            public string Make { get; set; }
            public string Model{get;set;}
            public string year { get; set; }

            
           }
      public class Book
      {
          public String title;
      }  

    }
}
