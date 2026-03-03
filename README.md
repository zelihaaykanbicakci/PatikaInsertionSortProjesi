# Veri Yapıları ve Algoritmalar Ödevleri

## Proje 1: Insertion Sort
**Dizi:** [22, 27, 16, 2, 18, 6]

### Sıralama Aşamaları:
1. [22, 27, 16, 2, 18, 6] -> (27 > 22, yerinde kalır)
2. [16, 22, 27, 2, 18, 6] -> (16 başa gelir)
3. [2, 16, 22, 27, 18, 6] -> (2 en başa gelir)
4. [2, 16, 18, 22, 27, 6] -> (18 uygun yere yerleşir)
5. [2, 6, 16, 18, 22, 27] -> (6 uygun yere yerleşir)

### Karmaşıklık (Big-O):
- **Average/Worst Case:** O(n²)
- **Best Case:** O(n)

### Case Analizi:
Dizi sıralandıktan sonra **18** sayısı dizinin ortasında bulunduğu için **Average Case** kapsamına girer.

---

## Proje 2: Selection Sort
**Dizi:** [7, 3, 5, 8, 2, 9, 4, 15, 6]
**İlk 4 Adım:**
1. [2, 3, 5, 8, 7, 9, 4, 15, 6] (En küçük 2 bulundu, 7 ile yer değişti)
2. [2, 3, 5, 8, 7, 9, 4, 15, 6] (Sıradaki 3 zaten en küçük)
3. [2, 3, 4, 8, 7, 9, 5, 15, 6] (En küçük 4 bulundu, 5 ile yer değişti)
4. [2, 3, 4, 5, 7, 9, 8, 15, 6] (En küçük 5 bulundu, 8 ile yer değişti)

## Proje 3: Binary Search Tree
Adım Adım BST Oluşturma Aşamaları:
Root 7'dir.

5, 7'den küçük olduğu için 7'nin soluna eklenir.

1, 7'den ve 5'ten küçük olduğu için 5'in soluna eklenir.

8, 7'den büyük olduğu için 7'nin sağına eklenir.

3, 7 ve 5'ten küçük ama 1'den büyük olduğu için 1'in sağına eklenir.

6, 7'den küçük ama 5'ten büyük olduğu için 5'in sağına eklenir.

0, hepsinden (7, 5, 1) küçük olduğu için 1'in soluna eklenir.

9, 7 ve 8'den büyük olduğu için 8'in sağına eklenir.

4, 7 ve 5'ten küçük, 1 ve 3'ten büyük olduğu için 3'ün sağına eklenir.

2, 7 ve 5'ten küçük, 1'den büyük ama 3'ten küçük olduğu için 3'ün soluna eklenir.