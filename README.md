# Set
SetИнтерфейс не добавляет никаких дополнительных методов , которые вы должны знать для экзамена.
Вам просто нужно знать, как наборы ведут себя по отношению к традиционным Collectionметодам. 
Вы также должны знать различия между типами наборов. Давайте начнем с HashSet:
3:    Set<Integer> set = new HashSet<>();
4:    boolean b1 = set.add(66);                                   // true
5:    boolean b2 = set.add(10);                                   // true
6:    boolean b3 = set.add(66);                                   // false
7:    boolean b4 = set.add(8);                                    // true
8:    for (Integer integer: set) System.out.print(integer + ","); // 66,8,10,
Эти add()методы должны быть простыми. Они возвращаются, trueесли они уже не Integerнаходятся в наборе.
Строка 6 возвращается false, потому что у нас уже есть 66 в наборе, и набор должен сохранить уникальность. 
В строке 8 печатаются элементы множества в произвольном порядке. В этом случае это не порядок сортировки или порядок добавления элементов.
Помните, что equals()метод используется для определения равенства. Этот hashCode()метод используется для определения того, в каком сегменте искать,
так чтобы Java не приходилось просматривать весь набор, чтобы выяснить, есть ли там объект. 
В лучшем случае хеш-коды уникальны, и Java должна вызывать equals()только один объект.
В худшем случае все реализации возвращают одно hashCode()и то же , и equals()в любом случае Java должна вызывать каждый элемент набора.
Теперь давайте посмотрим на тот же пример с TreeSet:
3:    Set<Integer> set = new HashSet<>();
4:    boolean b1 = set.add(66);                                    // true
5:    boolean b2 = set.add(10);                                    // true
6:    boolean b3 = set.add(66);                                    // false
7:    boolean b4 = set.add(8);                                     // true
8:    for (Integer integer: set) System.out.print(integer + ",");  // 8,10,66
На этот раз элементы распечатываются в естественном порядке. Числа реализуют Comparableинтерфейс в Java, который используется для сортировки.