#include <iostream>
#include <string>

int main()
{
  int lineCount;
  std::string line;
  std::cin >> lineCount;

  for (int i = 0; i < lineCount; i++)
  {
    std::getline(std::cin, line);
    std::cout << line << std::endl;
  }
}
