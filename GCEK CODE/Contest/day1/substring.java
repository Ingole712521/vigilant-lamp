import java.util.*;
class Solution{
static int word(char []s)
{
int T = s.length;
Vector<Integer> []X= new Vector[12];
for (int i = 0; i < X.length; i++)
X[i] = new Vector<Integer>();
for (int i = 0; i < s.length; i++)
{
	int x = s[i] - 'a';
	X[x].add(i);
}
int push = 0;
for (int i = 0; i < 12 &&
		'a' + i < s[0]; i++)
{
	if (X[i].size() > 0)
	{
	for (int j = 0;
			j < X[i].size();
			j++)
	{
		push = push + (T - X[i].get(j));
	}
	}
}
Vector<String> str = new Vector<String>();
for (int i = 0;
		i < X[s[0] - 'a'].size();
		i++)
{
	String word = "";
	int j = X[s[0] - 'a'].get(i);
	for (; j < T; j++)
	{
	word += (s[j]);
	str.add(word);
	}
}
Collections.sort(str);
for (int i = 0; i < str.size(); i++)
{
	if (!str.get(i).equals(String.valueOf(s)))
	{
	push++;
	}
	else
	{
	break;
	}
}
return push + 2;
}
public static void main(String[] args)
{
String str = "acb";
System.out.print(word(str.toCharArray()));
}
}