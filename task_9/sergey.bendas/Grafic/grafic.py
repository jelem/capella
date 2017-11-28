import matplotlib.pyplot as plt

def alg(n):
    k = 0
    i = 0
    while(i<n):
        j = i + 1
        while(j < n):
            z = j + 1
            while(z < n):
                k+=1
                z+=1
            j+=1
        i+=1
    return k

array = []
m = 0
while(m < 100):
    array.append(alg(m))
    m+=1

plt.plot(array)
plt.show()
