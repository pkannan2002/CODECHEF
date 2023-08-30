#include"stdio.h"
int isvowels(char c)
{
    if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U' )
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        char s[1000];
        scanf("%s",s);
        int happy=0;
        for(int i=0;s[i+2]!='\0';i++)
        {
            if(isvowels(s[i]) && isvowels(s[i+1]) && isvowels(s[i+2]) )
            {
                happy=1;
                break;
            }

        }
        if(happy)
        {
            printf("HAPPY \n");
        }
        else
        {
            printf("SAD \n");
        }
    }
}
