def count_substring(s, ss):
    k = 0
    for i in range(len(s) - len(ss)+1):
        if s[i:i + len(ss)] == ss:
            k += 1

    return k


if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()

    count = count_substring(string, sub_string)
    print(count)