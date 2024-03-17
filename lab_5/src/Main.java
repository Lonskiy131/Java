import java.util.*;

public class Main {
    public static void main (String[] args) {
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    private static void task4 () {
        ArrayDeque<Product> productQueue = new ArrayDeque<>();

        productQueue.offerLast(new Product("Product1", 10.0, "Category1"));
        productQueue.offerLast(new Product("Product2", 20.0, "Category2"));

        productQueue.push(new Product("Product3", 30.0, "Category3"));

        System.out.println("Перший елемент черги: " + productQueue.getFirst());

        System.out.println("Останній елемент черги: " + productQueue.peekLast());

        Product poppedProduct = productQueue.pop();
        System.out.println("Видалений перший елемент черги: " + poppedProduct);

        Product removedLastProduct = productQueue.removeLast();
        System.out.println("Видалений останній елемент черги: " + removedLastProduct);

        Product polledLastProduct = productQueue.pollLast();
        System.out.println("Видалений останній елемент черги (якщо вона не пуста): " + polledLastProduct);
    }


    public static void task3() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Product1", 10.0, "Category1"));
        productList.add(new Product("Product2", 20.0, "Category2"));

        List<Product> additionalProducts = new ArrayList<>();
        additionalProducts.add(new Product("Product3", 30.0, "Category3"));
        additionalProducts.add(new Product("Product4", 40.0, "Category4"));
        productList.addAll(additionalProducts);

        Product productAtIndex2 = productList.get(2);
        System.out.println("Елемент за індексом 2: " + productAtIndex2);

        int indexOfProduct2 = productList.indexOf(new Product("Product2", 20.0, "Category2"));
        System.out.println("Індекс першого входження Product2: " + indexOfProduct2);

        int lastIndexOfProduct2 = productList.lastIndexOf(new Product("Product2", 20.0, "Category2"));
        System.out.println("Індекс останнього входження Product2: " + lastIndexOfProduct2);

        Iterator<Product> iterator = productList.iterator();
        System.out.println("Елементи масиву:");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }

        ListIterator<Product> listIterator = productList.listIterator();
        System.out.println("Елементи масиву в обидва напрямки:");
        while (listIterator.hasNext()) {
            Product product = listIterator.next();
            System.out.println(product);
        }
        while (listIterator.hasPrevious()) {
            Product product = listIterator.previous();
            System.out.println(product);
        }

        productList.remove(0);
        System.out.println("Масив після видалення першого елемента: " + productList);

        productList.set(1, new Product("Product5", 50.0, "Category5"));
        System.out.println("Масив після заміни другого елемента: " + productList);

        Collections.sort(productList);
        System.out.println("Відсортований масив: " + productList);

        List<Product> subList = productList.subList(1, 3);
        System.out.println("Підсписок: " + subList);

        productList.clear();
        System.out.println("Масив після очищення: " + productList);

        boolean containsProduct5 = productList.contains(new Product("Product5", 50.0, "Category5"));
        System.out.println("Чи містить масив елемент Product5? " + containsProduct5);

        boolean isEmpty = productList.isEmpty();
        System.out.println("Чи порожній масив? " + isEmpty);

        int size = productList.size();
        System.out.println("Розмір масиву: " + size);

        Product[] productArray = productList.toArray(new Product[0]);
        System.out.println("Масив, отриманий з елементів: " + Arrays.toString(productArray));

        boolean retainAllres=productList.retainAll(additionalProducts);
        System.out.println("Застосування retainAll: "+retainAllres);
    }
    public static void task5() {
        Set<Product> productSet = new TreeSet<>();

        productSet.add(new Product("Product1", 10.0, "Category1"));
        productSet.add(new Product("Product2", 20.0, "Category2"));

        System.out.println("Перший елемент: " + productSet.iterator().next());
        System.out.println("Останній елемент: " + ((TreeSet<Product>) productSet).last());

        Set<Product> headSet = ((TreeSet<Product>) productSet).headSet(new Product("Product2", 20.0, "Category2"));
        System.out.println("Підмножина до Product2: " + headSet);

        Set<Product> subSet = ((TreeSet<Product>) productSet).subSet(new Product("Product1", 10.0, "Category1"),
                new Product("Product2", 20.0, "Category2"));
        System.out.println("Підмножина між Product1 та Product2: " + subSet);

        Set<Product> tailSet = ((TreeSet<Product>) productSet).tailSet(new Product("Product2", 20.0, "Category2"));
        System.out.println("Підмножина після Product2: " + tailSet);

        Product ceilingProduct = ((TreeSet<Product>) productSet).ceiling(new Product("Product1", 15.0, "Category"));
        System.out.println("Наступний елемент після Product1: " + ceilingProduct);

        Product floorProduct = ((TreeSet<Product>) productSet).floor(new Product("Product1", 15.0, "Category"));
        System.out.println("Попередній елемент перед Product1: " + floorProduct);

        Product higherProduct = ((TreeSet<Product>) productSet).higher(new Product("Product1", 15.0, "Category"));
        System.out.println("Наступний елемент після Product1: " + higherProduct);

        Product lowerProduct = ((TreeSet<Product>) productSet).lower(new Product("Product1", 15.0, "Category"));
        System.out.println("Попередній елемент перед Product1: " + lowerProduct);

        Product polledFirstProduct = ((TreeSet<Product>) productSet).pollFirst();
        System.out.println("Видалений перший елемент: " + polledFirstProduct);

        Product polledLastProduct = ((TreeSet<Product>) productSet).pollLast();
        System.out.println("Видалений останній елемент: " + polledLastProduct);

        Set<Product> descendingSet = ((TreeSet<Product>) productSet).descendingSet();
        System.out.println("Множина в зворотньому порядку: " + descendingSet);
    }
    public static void task6() {
        Map<String, Product> productMap = new HashMap<>();

        productMap.put("product1", new Product("Product 1", 10.0, "Category 1"));
        productMap.put("product2", new Product("Product 2", 20.0, "Category 2"));

        System.out.println("Значення за ключем 'product1': " + productMap.get("product1"));

        System.out.println("Чи містить мапа ключ 'product1'? " + productMap.containsKey("product1"));

        System.out.println("Чи містить мапа значення 'Product 1'? " + productMap.containsValue(new Product("Product 1", 10.0, "Category 1")));

        productMap.clear();
        System.out.println("Мапа після очищення: " + productMap);

        productMap.putIfAbsent("product1", new Product("Product 1", 10.0, "Category 1"));
        System.out.println("Мапа після використання putIfAbsent: " + productMap);

        Set<String> keys = productMap.keySet();
        System.out.println("Ключі мапи: " + keys);

        Collection<Product> values = productMap.values();
        System.out.println("Значення мапи: " + values);

        Map<String, Product> additionalProducts = new HashMap<>();
        additionalProducts.put("product3", new Product("Product 3", 30.0, "Category 3"));
        productMap.putAll(additionalProducts);
        System.out.println("Мапа після використання putAll: " + productMap);

        productMap.remove("product1");
        System.out.println("Мапа після видалення ключа 'product1': " + productMap);

        System.out.println("Розмір мапи продуктів: " + productMap.size());

        Set<Map.Entry<String, Product>> entrySet = productMap.entrySet();
        for (Map.Entry<String, Product> entry : entrySet) {
            System.out.println("Ключ: " + entry.getKey() + ", Значення: " + entry.getValue());
        }
    }
    public static void task7() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6));

        Collections.sort(numbers);
        System.out.println("Відсортований масив: " + numbers);

        int index = Collections.binarySearch(numbers, 5);
        System.out.println("Індекс числа 5: " + index);

        Collections.reverse(numbers);
        System.out.println("Обернутий масив: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Перетасований масив: " + numbers);

        Collections.fill(numbers, 0);
        System.out.println("Заповнений масив нулями: " + numbers);

        Integer max = Collections.max(numbers);
        Integer min = Collections.min(numbers);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);

        List<Integer> copy = new ArrayList<>(Collections.nCopies(numbers.size(), 0));
        Collections.copy(copy, numbers);
        System.out.println("Копія масиву: " + copy);

        Collections.rotate(numbers, 2);
        System.out.println("Обернутий масив на 2 позиції вправо: " + numbers);

        Collection<Integer> checkedNumbers = Collections.checkedCollection(new ArrayList<>(), Integer.class);
        checkedNumbers.addAll(numbers);
        System.out.println("Контрольована колекція: " + checkedNumbers);

        int frequency = Collections.frequency(numbers, 1);
        System.out.println("Кількість входжень числа 1: " + frequency);
    }
}

