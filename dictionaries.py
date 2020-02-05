#dictionaries
my_dict = {'key1':123, 'key2':'hello world', 'key3':['the good', 'the bad', 'and the ugly']};
print (my_dict['key1'])
print ('After changing the values of key1 in my_dict:')
my_dict['key1'] = my_dict['key1'] - 100;
print (my_dict['key1'])
print (my_dict['key3'])


my_dict2 = {'key1': 123, 'key2':[12, 13, 14], 'key3':['Revenge', 'ADHD']};
print (my_dict2['key3'])
print (my_dict2['key3'][0])
print (my_dict2['key3'][0].upper())
print (my_dict2['key2'][0])
print ('This is before and after self addition respectively')
(my_dict2['key2'][0]) +=199
print (my_dict2['key2'][0])


print ('\n\n')
d = {}
print (d)
d['key1'] = 'mango'
d['key2'] = 'apple'
print (d)

print ('\n\n')
e = {'key1':{'nestkey':{'subnestkey': 'value'}}}
print (e)
print (e['key1']['nestkey']['subnestkey'])


