package generic;

import java.util.LinkedHashSet;

public class Lhasset {
public static void main(String[] args) {
LinkedHashSet<Boolean> o = new LinkedHashSet<Boolean>();
o.add(true);
o.add(false);
for(boolean b:o)
{
System.out.println(b);	
}
}
}
