class MyHashMap:

    def __init__(self):
        self.keys = []
        self.values = []
        return None

    def put(self, key: int, value: int) -> None:
        if key in self.keys:
            idx = self.keys.index(key)
            self.values[idx] = value
        else:
            self.keys.append(key)
            self.values.append(value)
        return None
        
    def get(self, key: int) -> int:
        if key in self.keys:
            idx = self.keys.index(key)
            returning_val = self.values[idx]
        else:
            returning_val = -1
        return returning_val
        

    def remove(self, key: int) -> None:
        if key in self.keys:
            idx = self.keys.index(key)
            del self.keys[idx]
            del self.values[idx]
        
        return None
        


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)