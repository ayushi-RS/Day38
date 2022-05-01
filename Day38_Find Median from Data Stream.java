 class MedianFinder {
        List<Integer> data;

        public MedianFinder() {
            data = new ArrayList<>();
        }

        public void addNum(int num) {
            int index = Collections.binarySearch(data, num);
            if (index < 0) {
                index = -index - 1;
            }
            data.add(index, num);
        }

        public double findMedian() {
            int size = data.size();
            if (size % 2 == 0) {
                return (data.get(size / 2) + data.get(size / 2 - 1)) / 2.0;
            } else {
                return data.get(size / 2);
            }
        }
    }