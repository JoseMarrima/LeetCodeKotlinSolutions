fun simplifyPath(path: String): String {
        var dirs = path.split("/")
        var stack = Stack<String>()
        var ignore = HashSet<String>(arrayListOf("..", ".", ""))
        
        for (dir in dirs) {
            if (dir == ".." && stack.isNotEmpty()) {
                stack.pop()
            } else if (!ignore.contains(dir)) {
                stack.push(dir)
            }
        }
        var result = ""
        for (value in stack) {
            result = result + "/" + value 
        }
        
        return if (result.isEmpty()) "/" else result
}
