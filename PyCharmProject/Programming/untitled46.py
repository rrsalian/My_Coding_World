class A:
    pass

class B(A):
    pass
class C(A):
    pass
class D(B):
    pass
class E(C):
    pass
class F(D,E):
    pass

class G(F):
    pass
class H(G):
    pass

class I(F):
    pass

class J(I):
    pass

class K(I):
    pass

print(G.__mro__)

print(J.__mro__)

